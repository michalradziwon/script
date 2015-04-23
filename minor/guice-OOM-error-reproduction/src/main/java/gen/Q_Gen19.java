
  package gen;
  public class Q_Gen19 {
  		@com.google.inject.Inject
  		public Q_Gen19(Q_Gen20 q_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  