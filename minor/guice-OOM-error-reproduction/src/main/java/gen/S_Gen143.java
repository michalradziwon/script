
  package gen;
  public class S_Gen143 {
  		@com.google.inject.Inject
  		public S_Gen143(S_Gen144 s_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  