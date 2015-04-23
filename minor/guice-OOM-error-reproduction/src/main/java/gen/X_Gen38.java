
  package gen;
  public class X_Gen38 {
  		@com.google.inject.Inject
  		public X_Gen38(X_Gen39 x_gen39){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen39 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  