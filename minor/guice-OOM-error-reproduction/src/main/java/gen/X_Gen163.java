
  package gen;
  public class X_Gen163 {
  		@com.google.inject.Inject
  		public X_Gen163(X_Gen164 x_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  