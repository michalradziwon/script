
  package gen;
  public class X_Gen129 {
  		@com.google.inject.Inject
  		public X_Gen129(X_Gen130 x_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  