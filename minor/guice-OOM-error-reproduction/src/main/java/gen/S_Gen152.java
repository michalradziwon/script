
  package gen;
  public class S_Gen152 {
  		@com.google.inject.Inject
  		public S_Gen152(S_Gen153 s_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  