
  package gen;
  public class Q_Gen21 {
  		@com.google.inject.Inject
  		public Q_Gen21(Q_Gen22 q_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  