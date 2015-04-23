
  package gen;
  public class Q_Gen193 {
  		@com.google.inject.Inject
  		public Q_Gen193(Q_Gen194 q_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  