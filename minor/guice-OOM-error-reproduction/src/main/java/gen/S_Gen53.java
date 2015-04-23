
  package gen;
  public class S_Gen53 {
  		@com.google.inject.Inject
  		public S_Gen53(S_Gen54 s_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  