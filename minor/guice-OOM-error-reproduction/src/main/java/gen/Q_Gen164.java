
  package gen;
  public class Q_Gen164 {
  		@com.google.inject.Inject
  		public Q_Gen164(Q_Gen165 q_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  