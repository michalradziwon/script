
  package gen;
  public class S_Gen114 {
  		@com.google.inject.Inject
  		public S_Gen114(S_Gen115 s_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  