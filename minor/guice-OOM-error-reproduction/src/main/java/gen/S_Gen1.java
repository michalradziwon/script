
  package gen;
  public class S_Gen1 {
  		@com.google.inject.Inject
  		public S_Gen1(S_Gen2 s_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  