
  package gen;
  public class S_Gen34 {
  		@com.google.inject.Inject
  		public S_Gen34(S_Gen35 s_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  