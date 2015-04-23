
  package gen;
  public class L_Gen60 {
  		@com.google.inject.Inject
  		public L_Gen60(L_Gen61 l_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  