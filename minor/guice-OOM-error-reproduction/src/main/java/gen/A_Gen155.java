
  package gen;
  public class A_Gen155 {
  		@com.google.inject.Inject
  		public A_Gen155(A_Gen156 a_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  