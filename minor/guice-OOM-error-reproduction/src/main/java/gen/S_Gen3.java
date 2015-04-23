
  package gen;
  public class S_Gen3 {
  		@com.google.inject.Inject
  		public S_Gen3(S_Gen4 s_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  