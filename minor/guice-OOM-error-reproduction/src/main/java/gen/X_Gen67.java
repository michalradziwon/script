
  package gen;
  public class X_Gen67 {
  		@com.google.inject.Inject
  		public X_Gen67(X_Gen68 x_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  