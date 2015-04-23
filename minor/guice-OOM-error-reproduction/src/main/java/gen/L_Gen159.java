
  package gen;
  public class L_Gen159 {
  		@com.google.inject.Inject
  		public L_Gen159(L_Gen160 l_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  