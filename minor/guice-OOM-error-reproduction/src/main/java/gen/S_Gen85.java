
  package gen;
  public class S_Gen85 {
  		@com.google.inject.Inject
  		public S_Gen85(S_Gen86 s_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  