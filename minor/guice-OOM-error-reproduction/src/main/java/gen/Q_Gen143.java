
  package gen;
  public class Q_Gen143 {
  		@com.google.inject.Inject
  		public Q_Gen143(Q_Gen144 q_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  