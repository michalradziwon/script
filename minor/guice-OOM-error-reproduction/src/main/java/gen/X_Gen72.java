
  package gen;
  public class X_Gen72 {
  		@com.google.inject.Inject
  		public X_Gen72(X_Gen73 x_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  