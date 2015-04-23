
  package gen;
  public class L_Gen107 {
  		@com.google.inject.Inject
  		public L_Gen107(L_Gen108 l_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  