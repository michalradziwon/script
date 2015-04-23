
  package gen;
  public class Q_Gen37 {
  		@com.google.inject.Inject
  		public Q_Gen37(Q_Gen38 q_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  