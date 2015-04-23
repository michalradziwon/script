
  package gen;
  public class X_Gen114 {
  		@com.google.inject.Inject
  		public X_Gen114(X_Gen115 x_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  