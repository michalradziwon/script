
  package gen;
  public class S_Gen33 {
  		@com.google.inject.Inject
  		public S_Gen33(S_Gen34 s_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  