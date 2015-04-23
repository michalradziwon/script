
  package gen;
  public class L_Gen29 {
  		@com.google.inject.Inject
  		public L_Gen29(L_Gen30 l_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  