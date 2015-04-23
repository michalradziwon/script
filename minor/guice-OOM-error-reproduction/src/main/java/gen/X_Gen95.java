
  package gen;
  public class X_Gen95 {
  		@com.google.inject.Inject
  		public X_Gen95(X_Gen96 x_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  