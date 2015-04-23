
  package gen;
  public class Q_Gen11 {
  		@com.google.inject.Inject
  		public Q_Gen11(Q_Gen12 q_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  