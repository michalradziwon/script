
  package gen;
  public class X_Gen34 {
  		@com.google.inject.Inject
  		public X_Gen34(X_Gen35 x_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  