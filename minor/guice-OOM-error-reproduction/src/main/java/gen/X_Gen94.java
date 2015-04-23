
  package gen;
  public class X_Gen94 {
  		@com.google.inject.Inject
  		public X_Gen94(X_Gen95 x_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  