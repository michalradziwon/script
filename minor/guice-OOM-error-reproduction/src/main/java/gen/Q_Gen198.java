
  package gen;
  public class Q_Gen198 {
  		@com.google.inject.Inject
  		public Q_Gen198(Q_Gen199 q_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  