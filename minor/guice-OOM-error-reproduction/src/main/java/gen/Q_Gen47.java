
  package gen;
  public class Q_Gen47 {
  		@com.google.inject.Inject
  		public Q_Gen47(Q_Gen48 q_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  