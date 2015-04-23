
  package gen;
  public class X_Gen15 {
  		@com.google.inject.Inject
  		public X_Gen15(X_Gen16 x_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  