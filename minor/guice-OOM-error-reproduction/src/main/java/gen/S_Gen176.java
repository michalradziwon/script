
  package gen;
  public class S_Gen176 {
  		@com.google.inject.Inject
  		public S_Gen176(S_Gen177 s_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  