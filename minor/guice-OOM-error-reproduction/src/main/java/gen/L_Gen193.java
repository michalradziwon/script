
  package gen;
  public class L_Gen193 {
  		@com.google.inject.Inject
  		public L_Gen193(L_Gen194 l_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  