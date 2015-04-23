
  package gen;
  public class X_Gen155 {
  		@com.google.inject.Inject
  		public X_Gen155(X_Gen156 x_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  