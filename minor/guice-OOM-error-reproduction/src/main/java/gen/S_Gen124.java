
  package gen;
  public class S_Gen124 {
  		@com.google.inject.Inject
  		public S_Gen124(S_Gen125 s_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  