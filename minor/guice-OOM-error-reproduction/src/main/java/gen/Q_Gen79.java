
  package gen;
  public class Q_Gen79 {
  		@com.google.inject.Inject
  		public Q_Gen79(Q_Gen80 q_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  