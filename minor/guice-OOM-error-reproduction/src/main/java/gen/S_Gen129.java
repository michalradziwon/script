
  package gen;
  public class S_Gen129 {
  		@com.google.inject.Inject
  		public S_Gen129(S_Gen130 s_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  