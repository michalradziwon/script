
  package gen;
  public class X_Gen82 {
  		@com.google.inject.Inject
  		public X_Gen82(X_Gen83 x_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  