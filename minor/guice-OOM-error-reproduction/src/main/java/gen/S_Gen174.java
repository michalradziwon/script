
  package gen;
  public class S_Gen174 {
  		@com.google.inject.Inject
  		public S_Gen174(S_Gen175 s_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  