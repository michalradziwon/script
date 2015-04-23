
  package gen;
  public class Q_Gen171 {
  		@com.google.inject.Inject
  		public Q_Gen171(Q_Gen172 q_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  