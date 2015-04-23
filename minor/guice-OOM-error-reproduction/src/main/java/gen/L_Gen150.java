
  package gen;
  public class L_Gen150 {
  		@com.google.inject.Inject
  		public L_Gen150(L_Gen151 l_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  