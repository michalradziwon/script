
  package gen;
  public class Q_Gen129 {
  		@com.google.inject.Inject
  		public Q_Gen129(Q_Gen130 q_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  