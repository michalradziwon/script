
  package gen;
  public class B_Gen155 {
  		@com.google.inject.Inject
  		public B_Gen155(B_Gen156 b_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  