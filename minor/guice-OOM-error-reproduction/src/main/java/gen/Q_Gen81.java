
  package gen;
  public class Q_Gen81 {
  		@com.google.inject.Inject
  		public Q_Gen81(Q_Gen82 q_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  