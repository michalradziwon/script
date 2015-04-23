
  package gen;
  public class Q_Gen32 {
  		@com.google.inject.Inject
  		public Q_Gen32(Q_Gen33 q_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  