
  package gen;
  public class M_Gen153 {
  		@com.google.inject.Inject
  		public M_Gen153(M_Gen154 m_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  