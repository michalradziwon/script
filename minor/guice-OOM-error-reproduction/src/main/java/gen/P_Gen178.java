
  package gen;
  public class P_Gen178 {
  		@com.google.inject.Inject
  		public P_Gen178(P_Gen179 p_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  