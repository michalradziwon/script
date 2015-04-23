
  package gen;
  public class S_Gen150 {
  		@com.google.inject.Inject
  		public S_Gen150(S_Gen151 s_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  