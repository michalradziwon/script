
  package gen;
  public class L_Gen178 {
  		@com.google.inject.Inject
  		public L_Gen178(L_Gen179 l_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  