
  package gen;
  public class Q_Gen20 {
  		@com.google.inject.Inject
  		public Q_Gen20(Q_Gen21 q_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  