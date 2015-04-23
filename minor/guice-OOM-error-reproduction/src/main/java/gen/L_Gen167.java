
  package gen;
  public class L_Gen167 {
  		@com.google.inject.Inject
  		public L_Gen167(L_Gen168 l_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  