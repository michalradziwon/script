
  package gen;
  public class L_Gen91 {
  		@com.google.inject.Inject
  		public L_Gen91(L_Gen92 l_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  