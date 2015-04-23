
  package gen;
  public class Q_Gen42 {
  		@com.google.inject.Inject
  		public Q_Gen42(Q_Gen43 q_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  